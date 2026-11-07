package net.sourceforge.plantuml.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D0 = null;
        net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D2 = net.sourceforge.plantuml.utils.MathUtils.maxDim(xDimension2D0, xDimension2D1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"net.sourceforge.plantuml.klimt.geom.XDimension2D.getWidth()\" because \"dim1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char[] charArray2 = new char[] { '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray2, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '#' });
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) -1, 100.0d, (double) (-1.0f), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D0 = null;
        net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D1 = null;
        net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sourceforge.plantuml.klimt.geom.XDimension2D xDimension2D3 = net.sourceforge.plantuml.utils.MathUtils.maxDim(xDimension2D0, xDimension2D1, xDimension2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"net.sourceforge.plantuml.klimt.geom.XDimension2D.getWidth()\" because \"dim1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 'a', (double) 100L, (double) 100, (double) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) ' ', (double) (short) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max(1.0d, (double) '4', (double) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray0, (int) (byte) -1, 10, (int) '4', "////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3, (int) (byte) 1, (int) (byte) 100, (int) (short) 1, "////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max(52.0d, (-1.0d), (double) (-1), 52.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray0, (int) (byte) 1, (int) '4', (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) 100, (double) 1, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.decodeString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 10L, (double) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) '4', (double) (byte) 100, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 0, (double) 0L, (double) 100L, (double) (short) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 100, (double) 0, (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation(10.0d, (double) 100.0f, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max(52.0d, 52.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) 1, (double) 10, (double) 52, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray1, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        net.sourceforge.plantuml.utils.MathUtils mathUtils0 = new net.sourceforge.plantuml.utils.MathUtils();
        java.lang.Class<?> wildcardClass1 = mathUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.encodeString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aGkh" + "'", str1, "aGkh");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) 10.0f, 0.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 1, 32.0d, (double) '4', 0.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) (short) -1, (double) (byte) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 0L, (double) ' ', 32.0d, (double) (-1), 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) -1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) 100.0f, (double) 10L, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) (-1), (double) (short) 1, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.decodeString("////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 10.0f, (double) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max(10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray7, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 1, (double) (byte) 10, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, (double) (short) 1, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 0, (double) (-1L), (double) 52, (double) (short) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) ' ', (double) (-1.0f), (double) 0, (double) (short) 0, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) 10, (double) (short) 10, (double) (byte) -1, (double) (byte) -1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 0, (double) (short) -1, (double) 1L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) '4', (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("hi!");
        java.lang.Class<?> wildcardClass2 = boyerMoore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray7, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation(0.0d, (double) 0L, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.encodeString("aGkh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YUdraA==" + "'", str1, "YUdraA==");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decode("////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        net.sourceforge.plantuml.utils.StringTrie<java.io.Serializable> serializableStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.io.Serializable>();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 1.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (-1L), (double) 'a', (double) 1.0f, (double) '#', (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (-1L), (double) 'a', 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0L, (double) (short) 100, (double) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min(1.0d, (double) 10.0f, (double) 100.0f, (double) 0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) 100.0f, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0.0f, (double) (short) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        java.lang.Class<?> wildcardClass2 = boyerMoore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((-1.0d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strStringTrie0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) 10L, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max(0.0d, (double) (short) 10, (double) (-1L), (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str8 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str9 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "////\n" + "'", str8, "////\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "////\n" + "'", str9, "////\n");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 100, (double) 52, (double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        net.sourceforge.plantuml.utils.StringTrie<net.sourceforge.plantuml.utils.StringTrie<java.lang.String>> strStringTrieStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<net.sourceforge.plantuml.utils.StringTrie<java.lang.String>>();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length of Base64 encoded input string is not a multiple of 4.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) (short) 1, (double) (-1), (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0.0f, (double) (short) 100, (double) 1.0f, (double) 'a', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.encodeString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        byte[] byteArray8 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) 1L, 1.0d, (double) 0L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 1, 10.0d, (double) ' ', (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decode("");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max(100.0d, (double) (short) 0, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) 10.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3, (int) (short) 100, (int) (byte) -1, (int) (short) 0, "YUdraA==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((-1.0d), (double) (-1.0f), (double) ' ', (double) 10L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (-1), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        java.lang.String str2 = strStringTrie0.get("aGkh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3, (int) (byte) 0, 1, 1, "////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (short) 0, (double) 100.0f, (double) (-1), 1.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("YUdraA==");
        java.lang.String str7 = strStringTrie0.get("YUdraA==");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("YUdraA==");
        strStringTrie0.put("", "aGkh");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("hi!");
        int int3 = boyerMoore1.searchIn("////\n");
        java.lang.Class<?> wildcardClass4 = boyerMoore1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 196 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 'a', (double) 1L, (double) (short) 10, 97.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max(0.0d, 0.0d, 32.0d, (double) (-1), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 1, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min(1.0d, 1.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray8, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 10, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 0L, (double) 'a', (double) 1, (double) 1.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, 97.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100L, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 1.0f, (double) (byte) 0, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 100, (double) 1.0f, (-1.0d), (double) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min(100.0d, 32.0d, 0.0d, 100.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'A', 'P', '8', 'B', '/', 'w', 'o', 'B' });
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0, (double) (short) 100, (double) (byte) -1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max(10.0d, (double) (byte) 1, (double) '#', (double) 10, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        java.lang.String str12 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7, (int) '#', (int) (short) -1, (int) ' ', "////\n");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        char[] charArray12 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray13 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray12);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 100, (double) 0L, (double) (byte) -1, 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 10, (double) (byte) 0, 0.0d, (double) (-1), 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str8 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str9 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "////\n" + "'", str8, "////\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "////\n" + "'", str9, "////\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray12 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray14 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray11, (int) '4', (int) (byte) 0);
        java.lang.String str19 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray11, (int) (byte) 100, 0, (int) ' ', "aGkh");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray6, 1, (int) (short) 100, 10, "////\n");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.encodeString("YUdraA==");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "WVVkcmFBPT0=" + "'", str1, "WVVkcmFBPT0=");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.constant.Constable> constableStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.constant.Constable>();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) 52, 10.0d, 32.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("WVVkcmFBPT0=");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 89, (byte) 85, (byte) 100, (byte) 114, (byte) 97, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '/', '/', '/', '/' });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int4 = boyerMoore1.searchIn("////\n", (int) 'a');
        int int6 = boyerMoore1.searchIn("");
        int int8 = boyerMoore1.searchIn("");
        int int11 = boyerMoore1.searchIn("aGkh", 10);
        int int14 = boyerMoore1.searchIn("WVVkcmFBPT0=", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int4 = boyerMoore1.searchIn("////\n", (int) 'a');
        int int7 = boyerMoore1.searchIn("aGkh", (int) (short) 0);
        int int10 = boyerMoore1.searchIn("aGkh", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 52, (double) 0L, (double) 1, (double) 0.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min(52.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.encodeString("////\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ly8vLwo=" + "'", str1, "Ly8vLwo=");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str1 = net.sourceforge.plantuml.utils.Base64Coder.decodeString("WVVkcmFBPT0=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YUdraA==" + "'", str1, "YUdraA==");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 0, (double) (byte) 1, (double) 100L, (double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = charArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max(0.0d, 35.0d, (double) (-1.0f), 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("hi!");
        int int3 = boyerMoore1.searchIn("////\n");
        int int6 = boyerMoore1.searchIn("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int3 = boyerMoore1.searchIn("////\n");
        int int5 = boyerMoore1.searchIn("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray12 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("////\n");
        strStringTrie0.put("hi!", "WVVkcmFBPT0=");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) (byte) 10, 0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) '#', 1.0d, (double) 10L, (double) 0L, (double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3, 1, (int) (byte) 100, (int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7, 0, 10, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray8, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 1, (double) (byte) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) 100L, 35.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max(0.0d, (double) (-1.0f), (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) (byte) -1, (double) 10L, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("////\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (-1.0f), 100.0d, (double) 10, 35.0d, 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 'a', (double) (short) 10, (double) 52, (double) '4', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min(100.0d, 97.0d, (-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("YUdraA==");
        java.lang.String str7 = strStringTrie0.get("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) (-1), (double) 0, 52.0d, 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int3 = boyerMoore1.searchIn("hi!");
        int int6 = boyerMoore1.searchIn("", (int) (byte) -1);
        int int8 = boyerMoore1.searchIn("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        byte[] byteArray8 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray8, 1, (int) (short) -1, (int) (byte) -1, "Ly8vLwo=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 0, 32.0d, (double) 10.0f, (double) (-1.0f), (double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray12 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 100, 0.0d, (double) 10L, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min(100.0d, 52.0d, (double) (short) 1, (double) (byte) 1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 10, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) '4', (double) (-1.0f), 32.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 0, (double) 10L, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) 1.0f, (double) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str12 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("hi!");
        int int3 = boyerMoore1.searchIn("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max(0.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (short) 10, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray8, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation((double) 10.0f, (double) (byte) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) 0, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        byte[] byteArray8 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '/', '/', '/', '/' });
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, (double) (-1.0f), 0.0d, 10.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.limitation(0.0d, (double) '4', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("Ly8vLwo=");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 47, (byte) 47, (byte) 47, (byte) 47, (byte) 10 });
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, (double) 100L, (double) (-1L), (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10);
        char[] charArray12 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("");
        strStringTrie0.put("WVVkcmFBPT0=", "YUdraA==");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "////\n" + "'", str5, "////\n");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) 100.0f, (double) 1L, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.reflect.AnnotatedElement> annotatedElementStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        char[] charArray7 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3);
        byte[] byteArray8 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray7);
        java.lang.String str9 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '/', '/', '/', '/' });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "////\n" + "'", str9, "////\n");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 1, 0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int4 = boyerMoore1.searchIn("////\n", (int) 'a');
        int int7 = boyerMoore1.searchIn("aGkh", (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = boyerMoore1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.max((double) (-1L), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (short) 0, 52.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) (-1.0f), (double) 100L, (double) 1.0f, (double) 52, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray12 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray12, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray14 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray11, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray11, (-1), (int) (short) 10, (int) (short) -1, "YUdraA==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max(1.0d, (double) 0L, 100.0d, (double) 52, (double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("");
        java.lang.String str7 = strStringTrie0.get("WVVkcmFBPT0=");
        java.lang.String str9 = strStringTrie0.get("WVVkcmFBPT0=");
        java.lang.String str11 = strStringTrie0.get("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "////\n" + "'", str5, "////\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min(0.0d, (-1.0d), 35.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("Ly8vLwo=");
        java.lang.String str2 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 47, (byte) 47, (byte) 47, (byte) 47, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ly8vLwo=\n" + "'", str2, "Ly8vLwo=\n");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray10, (int) '4', (int) (byte) 0, (int) (short) -1, "WVVkcmFBPT0=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min(100.0d, (double) (-1), (double) 'a', (double) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.max((double) 1, (double) (-1.0f), (double) '#', (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int3 = boyerMoore1.searchIn("////\n");
        java.lang.Class<?> wildcardClass4 = boyerMoore1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int4 = boyerMoore1.searchIn("////\n", (int) 'a');
        int int6 = boyerMoore1.searchIn("");
        int int9 = boyerMoore1.searchIn("////\n", 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((-1.0d), (double) 100L, (double) 100.0f, (double) 10.0f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.Class<?>> wildcardClassStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.Class<?>>();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) -1, (double) '#', (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100L, (double) 'a', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) ' ', (double) (byte) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) (-1.0f), (double) (byte) -1, 52.0d, (double) ' ', (double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        double double4 = net.sourceforge.plantuml.utils.MathUtils.min((double) ' ', 0.0d, (double) 100L, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str8 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str9 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////\n" + "'", str7, "////\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "////\n" + "'", str8, "////\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "////\n" + "'", str9, "////\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "////\n" + "'", str10, "////\n");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.max((double) (byte) 100, (double) (short) 10, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("aGkh");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int1 = net.sourceforge.plantuml.utils.MathUtils.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10);
        java.lang.Class<?> wildcardClass12 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6, 0, 0);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        char[] charArray11 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.Class<?> wildcardClass12 = charArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("YUdraA==");
        int int3 = boyerMoore1.searchIn("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decode("Ly8vLwo=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray1, (int) (byte) 100, (int) ' ', (int) (byte) 0, "aGkh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 47, (byte) 47, (byte) 47, (byte) 47, (byte) 10 });
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("YUdraA==");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 71, (byte) 107, (byte) 104 });
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.max((double) 100, (double) (-1.0f), (double) 10.0f, 100.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decode("aGkh");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray13 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int4 = boyerMoore1.searchIn("////\n", (int) 'a');
        int int7 = boyerMoore1.searchIn("aGkh", (int) (short) 0);
        int int9 = boyerMoore1.searchIn("WVVkcmFBPT0=");
        int int11 = boyerMoore1.searchIn("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        byte[] byteArray11 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        char[] charArray13 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray11, 0);
        byte[] byteArray14 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("aGkh");
        int int4 = boyerMoore1.searchIn("", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("////\n");
        int int3 = boyerMoore1.searchIn("////\n");
        int int6 = boyerMoore1.searchIn("aGkh", 0);
        int int8 = boyerMoore1.searchIn("aGkh");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        double double5 = net.sourceforge.plantuml.utils.MathUtils.min((double) 100.0f, (double) (short) 0, (double) (-1.0f), (double) (short) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("////\n");
        strStringTrie0.put("////\n", "aGkh");
        strStringTrie0.put("YUdraA==", "Ly8vLwo=\n");
        java.lang.String str13 = strStringTrie0.get("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////\n" + "'", str13, "////\n");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        net.sourceforge.plantuml.utils.BoyerMoore boyerMoore1 = new net.sourceforge.plantuml.utils.BoyerMoore("hi!");
        int int3 = boyerMoore1.searchIn("YUdraA==");
        int int5 = boyerMoore1.searchIn("WVVkcmFBPT0=");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        double double3 = net.sourceforge.plantuml.utils.MathUtils.min((double) 1.0f, (double) '4', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        net.sourceforge.plantuml.utils.StringTrie<java.lang.String> strStringTrie0 = new net.sourceforge.plantuml.utils.StringTrie<java.lang.String>();
        strStringTrie0.put("", "////\n");
        java.lang.String str5 = strStringTrie0.get("////\n");
        strStringTrie0.put("WVVkcmFBPT0=", "aGkh");
        strStringTrie0.put("hi!", "YUdraA==");
        java.lang.String str13 = strStringTrie0.get("Ly8vLwo=");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        byte[] byteArray1 = net.sourceforge.plantuml.utils.Base64Coder.decodeLines("Ly8vLwo=");
        char[] charArray3 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 47, (byte) 47, (byte) 47, (byte) 47, (byte) 10 });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        java.lang.String str10 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray10);
        char[] charArray12 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10);
        java.lang.Class<?> wildcardClass13 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        double double2 = net.sourceforge.plantuml.utils.MathUtils.min((double) (byte) 10, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        char[] charArray6 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray3, (int) (byte) 100, (int) (short) 0);
        byte[] byteArray7 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray6);
        char[] charArray8 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        char[] charArray9 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray7);
        byte[] byteArray10 = net.sourceforge.plantuml.utils.Base64Coder.decode(charArray9);
        java.lang.String str11 = net.sourceforge.plantuml.utils.Base64Coder.encodeLines(byteArray10);
        char[] charArray12 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = net.sourceforge.plantuml.utils.Base64Coder.encode(byteArray10, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }
}

