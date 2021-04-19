// https://edabit.com/challenge/wJBWjX5kSPMKLFmPX

function shhh(sentence) 
{
	return `'"${sentence.charAt(0).toUpperCase() + sentence.slice(1).toLowerCase()}", whispered edabit.'`
}

console.log(shhh("HI THERE!"));