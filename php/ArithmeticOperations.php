<?php
    // https://edabit.com/challenge/wECZz9K5t752EBxFq
    function arithmeticOperation($n) 
    {   
        $operation = explode(" ", $n);
        switch ($operation[1])
        {
            case "+":
                return (int)$operation[0] + (int)$operation[2];
            case "-":
                return (int)$operation[0] - (int)$operation[2];
            case "/":
                if ($operation[2] == 0)
                    return -1;
                return (int)$operation[0] / (int)$operation[2];
            case "*":
                return (int)$operation[0] * (int)$operation[2];
        }
    }

    echo arithmeticOperation("12 + 12");
    echo arithmeticOperation("12 - 12");
    echo arithmeticOperation("12 * 12");
    echo arithmeticOperation("12 / 0");
?>