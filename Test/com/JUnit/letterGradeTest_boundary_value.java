package com.JUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class letterGradeTest_boundary_value {
    LetterGrade tester = new LetterGrade();
    @Test
    public void letterGradeX() {
        assertEquals('X', tester.letterGrade(-1));
        assertEquals('X', tester.letterGrade(101));
    }
    @Test
    public void letterGradeF() {
        assertEquals('F',tester.letterGrade(0));
        assertEquals('F',tester.letterGrade(59));
    }
    @Test
    public void letterGradeD() {
        assertEquals('D',tester.letterGrade(60));
        assertEquals('D',tester.letterGrade(69));
    }
    @Test
    public void letterGradeC() {
        assertEquals('C',tester.letterGrade(70));
        assertEquals('C',tester.letterGrade(79));
    }
    @Test
    public void letterGradeB() {
        assertEquals('B',tester.letterGrade(80));
        assertEquals('B',tester.letterGrade(89));
    }
    @Test
    public void letterGradeA() {
        assertEquals('A',tester.letterGrade(90));
        assertEquals('A',tester.letterGrade(100));
    }
}