package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest
{
    @Test
    public void testArea(){
        Square s= new Square (5);
        //сравнение ожидаемого (25) и полученного результатов
        Assert.assertEquals( s.area(),25.0);
    }

}
