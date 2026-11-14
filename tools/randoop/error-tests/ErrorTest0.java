package net.sourceforge.plantuml.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler0.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject2 = new net.sourceforge.plantuml.json.JsonObject();
        defaultHandler0.startObjectValue(jsonObject2, "IA==\n");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler5 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler5.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject7 = new net.sourceforge.plantuml.json.JsonObject();
        defaultHandler5.startObjectValue(jsonObject7, "IA==\n");
        net.sourceforge.plantuml.json.JsonObject jsonObject10 = net.sourceforge.plantuml.json.JsonObject.unmodifiableObject(jsonObject7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHandler0.endObjectValue(jsonObject10, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler0.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject2 = new net.sourceforge.plantuml.json.JsonObject();
        defaultHandler0.startObjectValue(jsonObject2, "IA==\n");
        net.sourceforge.plantuml.json.JsonObject jsonObject5 = net.sourceforge.plantuml.json.JsonObject.unmodifiableObject(jsonObject2);
        net.sourceforge.plantuml.json.JsonObject jsonObject6 = new net.sourceforge.plantuml.json.JsonObject(jsonObject5);
        net.sourceforge.plantuml.json.JsonObject jsonObject9 = jsonObject6.add("", (int) (short) 100);
        java.util.List<java.lang.String> strList10 = jsonObject9.names();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = jsonObject9.asInt();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        net.sourceforge.plantuml.json.JsonParser jsonParser1 = new net.sourceforge.plantuml.json.JsonParser((net.sourceforge.plantuml.json.JsonHandler<net.sourceforge.plantuml.json.JsonArray, net.sourceforge.plantuml.json.JsonObject>) defaultHandler0);
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler2 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler2.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject4 = new net.sourceforge.plantuml.json.JsonObject();
        defaultHandler2.startObjectValue(jsonObject4, "IA==\n");
        net.sourceforge.plantuml.json.JsonObject jsonObject7 = net.sourceforge.plantuml.json.JsonObject.unmodifiableObject(jsonObject4);
        net.sourceforge.plantuml.json.JsonObject jsonObject8 = new net.sourceforge.plantuml.json.JsonObject(jsonObject7);
        long long11 = jsonObject8.getLong("", 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHandler0.endObjectValue(jsonObject8, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        net.sourceforge.plantuml.json.JsonArray jsonArray1 = new net.sourceforge.plantuml.json.JsonArray();
        net.sourceforge.plantuml.json.JsonObject jsonObject2 = net.sourceforge.plantuml.json.Json.object();
        net.sourceforge.plantuml.json.JsonArray jsonArray3 = jsonArray1.add((net.sourceforge.plantuml.json.JsonValue) jsonObject2);
        net.sourceforge.plantuml.json.JsonArray jsonArray4 = jsonArray3.asArray();
        net.sourceforge.plantuml.json.JsonArray jsonArray5 = jsonArray3.asArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHandler0.endArrayValue(jsonArray3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        net.sourceforge.plantuml.json.JsonArray jsonArray0 = new net.sourceforge.plantuml.json.JsonArray();
        net.sourceforge.plantuml.json.JsonObject jsonObject1 = net.sourceforge.plantuml.json.Json.object();
        net.sourceforge.plantuml.json.JsonArray jsonArray2 = jsonArray0.add((net.sourceforge.plantuml.json.JsonValue) jsonObject1);
        net.sourceforge.plantuml.json.JsonArray jsonArray3 = jsonArray2.asArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long4 = jsonArray2.asLong();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        double[] doubleArray5 = new double[] { 1.0d, (short) 1, 10.0f, (byte) 0, 1 };
        net.sourceforge.plantuml.json.JsonArray jsonArray6 = net.sourceforge.plantuml.json.Json.array(doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        net.sourceforge.plantuml.json.JsonObject jsonObject7 = jsonArray6.asObject();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler0.startNumber();
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler2 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler2.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject4 = new net.sourceforge.plantuml.json.JsonObject();
        defaultHandler2.startObjectValue(jsonObject4, "IA==\n");
        net.sourceforge.plantuml.json.JsonObject jsonObject7 = net.sourceforge.plantuml.json.JsonObject.unmodifiableObject(jsonObject4);
        net.sourceforge.plantuml.json.JsonObject jsonObject8 = new net.sourceforge.plantuml.json.JsonObject(jsonObject7);
        net.sourceforge.plantuml.json.JsonObject jsonObject11 = jsonObject8.add("", (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHandler0.endObjectValue(jsonObject8, "IA==\n");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        net.sourceforge.plantuml.tim.FunctionsSet functionsSet0 = new net.sourceforge.plantuml.tim.FunctionsSet();
        net.sourceforge.plantuml.tim.TFunctionImpl tFunctionImpl1 = functionsSet0.pendingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionsSet0.executeEndfunction();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        net.sourceforge.plantuml.json.Json.DefaultHandler defaultHandler0 = new net.sourceforge.plantuml.json.Json.DefaultHandler();
        defaultHandler0.startNumber();
        net.sourceforge.plantuml.json.JsonObject jsonObject2 = net.sourceforge.plantuml.json.Json.object();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHandler0.endObjectValue(jsonObject2, "~[-1, 100, 32]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        net.sourceforge.plantuml.utils.LineLocation lineLocation2 = null;
        net.sourceforge.plantuml.utils.LineLocationImpl lineLocationImpl3 = new net.sourceforge.plantuml.utils.LineLocationImpl("[-1, 100, 32]", lineLocation2);
        net.sourceforge.plantuml.utils.LineLocationImpl lineLocationImpl4 = new net.sourceforge.plantuml.utils.LineLocationImpl("006401ff01", (net.sourceforge.plantuml.utils.LineLocation) lineLocationImpl3);
        java.lang.String str5 = lineLocationImpl4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on lineLocationImpl3 and lineLocationImpl4", (lineLocationImpl3.compareTo(lineLocationImpl4) == 0) == lineLocationImpl3.equals(lineLocationImpl4));
    }
}

