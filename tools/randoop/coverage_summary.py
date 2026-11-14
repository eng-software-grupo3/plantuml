#!/usr/bin/env python3
"""Resume a cobertura do JaCoCo (index.html) para os pacotes do escopo do Randoop."""
import re
import sys

HTML = sys.argv[1] if len(sys.argv) > 1 else "build/reports/jacoco/test/html/index.html"
BASE = "net.sourceforge.plantuml."
SCOPE = ["utils", "tim", "code", "ebnf", "json", "real"]


def num(txt):
    digits = re.sub(r"[^0-9]", "", txt)
    return int(digits) if digits else 0


html = open(HTML, encoding="utf-8").read()
rows = re.findall(r"<tr>(.*?)</tr>", html, re.S)
data = {}
for row in rows:
    link = re.search(r'class="el_package">([^<]+)</a>', row)
    if not link:
        continue
    cells = re.findall(r'<td class="ctr[12]"[^>]*>([^<]*)</td>', row)
    if len(cells) < 10:
        continue
    data[link.group(1)] = cells

tot = {"ml": 0, "l": 0, "mm": 0, "m": 0, "mc": 0, "c": 0}
print(f"{'pacote':45} {'instr%':>7} {'ramos%':>7} {'linhas':>16} {'metodos':>14} {'classes':>12}")
for pkg in sorted(data):
    if not any(pkg == BASE + s or pkg.startswith(BASE + s + ".") for s in SCOPE):
        continue
    c = data[pkg]
    ml, l, mm, m, mc, cl = num(c[4]), num(c[5]), num(c[6]), num(c[7]), num(c[8]), num(c[9])
    tot["ml"] += ml; tot["l"] += l; tot["mm"] += mm; tot["m"] += m; tot["mc"] += mc; tot["c"] += cl
    print(f"{pkg:45} {c[0]:>7} {c[1]:>7} {l - ml:>7}/{l:<8} {m - mm:>6}/{m:<7} {cl - mc:>5}/{cl:<6}")


def pct(a, b):
    return f"{100 * a / b:.1f}%" if b else "n/a"


print("-" * 100)
print(f"Linhas cobertas:   {tot['l'] - tot['ml']}/{tot['l']} = {pct(tot['l'] - tot['ml'], tot['l'])}")
print(f"Metodos cobertos:  {tot['m'] - tot['mm']}/{tot['m']} = {pct(tot['m'] - tot['mm'], tot['m'])}")
print(f"Classes tocadas:   {tot['c'] - tot['mc']}/{tot['c']} = {pct(tot['c'] - tot['mc'], tot['c'])}")
