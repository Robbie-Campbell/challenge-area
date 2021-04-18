// https://edabit.com/challenge/cSymahmP7vfHSm2jF

function isVowelSandwich(str) 
{
	if (str.length != 3)
        return false;
    return !/[aeiou]/i.test(str[0]) && /[aeiou]/i.test(str[1]) && !/[aeiou]/i.test(str[2]); 
}

console.log(isVowelSandwich("cat"));

console.log(isVowelSandwich("try"));