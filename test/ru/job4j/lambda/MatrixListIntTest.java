package ru.job4j.lambda;

import org.junit.Test;
//5. Преобразование матрицы чисел в список чисел. [#362897]

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.lambda.MatrixListInt.convert;

public class MatrixListIntTest {
    @Test
    public void convertIntToList(){
        Integer[][] matrx = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        List<Integer> con = convert(matrx);
        List<Integer> conEql = new ArrayList<>();
        conEql.add(1);
        conEql.add(2);
        conEql.add(3);
        conEql.add(2);
        conEql.add(3);
        conEql.add(4);
        conEql.add(3);
        conEql.add(4);
        conEql.add(5);
        assertThat(con, is(conEql));
    }

}