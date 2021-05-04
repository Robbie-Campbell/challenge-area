<?php
    function alphaNum($str) 
    {   
        $return_val = "";
        foreach (str_split($str) as $letter) 
        {
            $return_val .= ord(strtolower($letter)) - 97;
            $return_val .= " ";
        }
        return $return_val;
    }

    echo alphaNum("JAVASCRIPT");
?>