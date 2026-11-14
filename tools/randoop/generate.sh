#!/bin/bash
# Gera os testes de regressão do Randoop para as classes de tools/randoop/classlist.txt
RANDOOP_JAR="${RANDOOP_JAR:-$HOME/ferramentas/randoop/randoop-4.3.4/randoop-all-4.3.4.jar}"
cd "$(dirname "$0")/../.." || exit 1
rm -f src/test/java/net/sourceforge/plantuml/randoop/*.java
java -Xmx2g -classpath "$RANDOOP_JAR:build/classes/java/main:build/resources/main" randoop.main.Main gentests \
  --classlist=tools/randoop/classlist.txt \
  --time-limit=180 \
  --output-limit=1500 \
  --junit-package-name=net.sourceforge.plantuml.randoop \
  --junit-output-dir=src/test/java \
  --omit-field=net.sourceforge.plantuml.TitledDiagram.FORCE_SMETANA \
  --omit-classes=net.sourceforge.plantuml.code.SpiralOnRectangle \
  2>&1 | tee tools/randoop/generation.log
# Os testes de erro falham de proposito (reproduzem a excecao encontrada): ficam fora da pasta de testes
mkdir -p tools/randoop/error-tests
mv src/test/java/net/sourceforge/plantuml/randoop/ErrorTest*.java tools/randoop/error-tests/ 2>/dev/null
