package HateDuplicatedNumber;

import org.junit.Assert;
import org.junit.Test;


public class HateDuplicatedNumberTest {

    HateDuplicatedNumber hateDuplicatedNumber = new HateDuplicatedNumber();
    int numbers1[] = {1, 1, 2, 2, 2, 3, 3, 4};
    int numbers2[] = {1, 1, 2, 2, 1, 1, 0, 0, 3, 3};
    int numbers3[] = {3, 2, 1, 1, 2, 3};


    @Test
    public void marathon() {
        Assert.assertArrayEquals(hateDuplicatedNumber.solution(numbers1), new int[]{1, 2, 3, 4});
        Assert.assertArrayEquals(hateDuplicatedNumber.solution(numbers2), new int[]{1, 2, 1, 0, 3});
        Assert.assertArrayEquals(hateDuplicatedNumber.solution(numbers3), new int[]{3, 2, 1, 2, 3});
    }
}