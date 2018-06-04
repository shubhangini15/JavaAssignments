/*storeIdx: the current position available for insertion.
j: the end of one word(including one trailing space), used for copying word one by one.
i: the beginning of one word.

put a blank space in front of the word if this word is not the first word

copy the word to the position starts with storeIndex

reverse the word

update the possible start of next word*/
public class ReverseWordsInString {

	public String reverseWords(String s) {
        if (s.length() < 1) {
        	return s; // empty string
        }
        int startIdx = 0;
        char[] str = s.toCharArray();
        
        // reverse whole string
        reverse(str, 0, str.length - 1);
        
        // reverse word one by one
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                if (startIdx != 0) str[startIdx++] = ' ';
                int j = i;
                while (j < str.length && str[j] != ' ')
                    str[startIdx++] = str[j++];
                
                
                reverse(str, startIdx - (j - i), startIdx - 1); // startIdx - 1, NOT startIdx; 
                // C++ std::reverse : Reverses the order of the elements in the range [first, last)
                i = j;
            }
        }
        return new String(str, 0, startIdx);
    }

    private void reverse(char[] str, int begin, int end) {
        for (; begin < end; begin++, end--) {
            char tmp = str[begin];
            str[begin] = str[end];
            str[end] = tmp;
        }
    }
 
    // Driver methods to test above method
    public static void main(String[] args)
    {
        String sentence1 = "You Sing";
        ReverseWordsInString rev = new ReverseWordsInString();
        System.out.println(rev.reverseWords(sentence1));
 
        /*String sentence2 = "I love Java Programming";
        System.out.println(rev.reverseWords(sentence2));*/
    }
}
/*public String reverseWords(String str) {
if (str == null) 
	return null;
//convert string to char
char[] a = str.toCharArray();
int n = a.length;

// step 1. reverse the whole string
reverse(a, 0, n - 1); //a=8,0,n=(8-1)
// step 2. reverse each word
reverseWords(a, n);//a=8, n=8
// step 3. clean up spaces
return cleanSpaces(a, n);
}

void reverseWords(char[] a, int n) {
int i = 0, j = 0;
  
while (i < n) {//i=0,n=8
  while (i < j || i < n && a[i] == ' ') i++; // skip spaces
  while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
  reverse(a, i, j - 1);                      // reverse the word //j=4
}
}

// trim leading, trailing and multiple spaces
String cleanSpaces(char[] a, int n) {
int i = 0, j = 0;
  
while (j < n) {
  while (j < n && a[j] == ' ') j++;             // skip spaces
  while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
  while (j < n && a[j] == ' ') j++;             // skip spaces
  if (j < n) a[i++] = ' ';                      // keep only one space
}

return new String(a).substring(0, i);
}

// reverse a[] from a[i] to a[j]
private void reverse(char[] a, int i, int j) {
while (i < j) { //(i=0 < j=7)...(i=0 <j=3)
  char t = a[i]; //t = Y
  a[i] = a[j]; //i = 1
  a[j] = t; //j=6
  i++; j--;
}
}
*/