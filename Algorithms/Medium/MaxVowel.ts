function maxVowels(s: string, k: number): number {
    const vowel = new Set(["a","e","i","o","u"]);
    let ans = 0;
    let count = 0;
    let l = 0;
    for (let r = 0; r < s.length; r++){
        if (vowel.has(s[r])){
            count ++;
        }
        if(r -l +1 > k){
            if (vowel.has(s[l])){
                count --;
            }
            l++;
        }   
        ans = Math.max(ans, count);
    } 
    return ans;
}; 

function main() {
    // Test cases
    let test1 = { s: "hello world", k: 3 };
    let test2 = { s: "programming", k: 2 };
    let test3 = { s: "chatbot", k: 1 };
    let test4 = { s: "artificial intelligence", k: 5 };

    // Running tests
    console.log(`Max vowels in "${test1.s}" (k=${test1.k}): `, maxVowels(test1.s, test1.k));
    console.log(`Max vowels in "${test2.s}" (k=${test2.k}): `, maxVowels(test2.s, test2.k));
    console.log(`Max vowels in "${test3.s}" (k=${test3.k}): `, maxVowels(test3.s, test3.k));
    console.log(`Max vowels in "${test4.s}" (k=${test4.k}): `, maxVowels(test4.s, test4.k));
}

// Calling the main function to execute
main();
