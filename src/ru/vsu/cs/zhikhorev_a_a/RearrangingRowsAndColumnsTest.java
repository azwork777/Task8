package ru.vsu.cs.zhikhorev_a_a;

import org.junit.Test;
import org.junit.Assert;
import ru.vsu.cs.util.ArrayUtils;


public class RearrangingRowsAndColumnsTest {
    RearrangingRowsAndColumns rearrangingRowsAndColumns = new RearrangingRowsAndColumns();

    @Test
    public void testRearrangeRowsAndColumns1() {
        int[][] matrix = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput01.txt");
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput01.txt");
        int[][] factualResult = rearrangingRowsAndColumns.rearrangeRowsAndColumns(matrix);

        Assert.assertArrayEquals(expectedResult, factualResult);


    }

    @Test
    public void testRearrangeRowsAndColumns2() {
        int[][] matrix = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput02.txt");
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput02.txt");
        int[][] factualResult = rearrangingRowsAndColumns.rearrangeRowsAndColumns(matrix);

        Assert.assertArrayEquals(expectedResult, factualResult);


    }

    @Test
    public void testRearrangeRowsAndColumns3() {
        int[][] matrix = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput03.txt");
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput03.txt");
        int[][] factualResult = rearrangingRowsAndColumns.rearrangeRowsAndColumns(matrix);

        Assert.assertArrayEquals(expectedResult, factualResult);


    }

    @Test
    public void testRearrangeRowsAndColumns4() {
        int[][] matrix = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput04.txt");
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput04.txt");
        int[][] factualResult = rearrangingRowsAndColumns.rearrangeRowsAndColumns(matrix);

        Assert.assertArrayEquals(expectedResult, factualResult);


    }

    @Test
    public void testRearrangeRowsAndColumns5() {
        int[][] matrix = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput05.txt");
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("C:\\Users\\Kein_\\IdeaProjects\\Task8\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput05.txt");
        int[][] factualResult = rearrangingRowsAndColumns.rearrangeRowsAndColumns(matrix);

        Assert.assertArrayEquals(expectedResult, factualResult);


    }
}