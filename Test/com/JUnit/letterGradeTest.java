package com.JUnit;
import org.junit.Test;
import static org.junit.Assert.*;
public class letterGradeTest {
    LetterGrade tester = new LetterGrade();
    @Test
    public void letterGradeX() {
        assertEquals('X', tester.letterGrade(-5));
        assertEquals('X', tester.letterGrade(200));
    }
    @Test
    public void letterGradeF() {
        assertEquals('F',tester.letterGrade(0));
        assertEquals('F',tester.letterGrade(25));
        assertEquals('F',tester.letterGrade(59));
    }
    @Test
    public void letterGradeD() {
        assertEquals('D',tester.letterGrade(60));
        assertEquals('D',tester.letterGrade(65));
        assertEquals('D',tester.letterGrade(69));
    }
    @Test
    public void letterGradeC() {
        assertEquals('C',tester.letterGrade(70));
        assertEquals('C',tester.letterGrade(75));
        assertEquals('C',tester.letterGrade(79));
    }
    @Test
    public void letterGradeB() {
        assertEquals('B',tester.letterGrade(80));
        assertEquals('B',tester.letterGrade(85));
        assertEquals('B',tester.letterGrade(89));
    }
    @Test
    public void letterGradeA() {
        assertEquals('A',tester.letterGrade(90));
        assertEquals('A',tester.letterGrade(95));
        assertEquals('A',tester.letterGrade(100));
    }
}