
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram
{
   //initialisation 
    private String inputWord = "";
    private List<String> anagrams = new ArrayList<>();
    private List<String> wordList = new ArrayList<>();

     public Anagram(String word)
    {
        this.inputWord = word;
    }

    public List<String> match(List<String> wordList)
    {   
       // verifying if the given list is not empty
        
        if (wordList.size() > 0)
        {
            for (String element : wordList)
            {
                // verifying if the have the same length
                
                if (this.inputWord.length() == element.length())
                {

                    if (this.inputWord.equalsIgnoreCase(element) == false)
                    {
                        // converting in lower case an sorting in alphabetic oder
                        
                        char tempInputWord[] = this.inputWord.toLowerCase().toCharArray();
                        Arrays.sort(tempInputWord);
                        char sortedElement[] = element.toLowerCase().toCharArray();
                        Arrays.sort(sortedElement);
                        
                       // comparing the are equals after sorting and converting in lower case
                       
                        if (Arrays.equals(sortedElement, tempInputWord))
                        {
                            // adding the element to the list of Anagrams
                            anagrams.add(element);

                        } else
                        {

                        }

                    } else
                    {

                    }
                } else
                {

                }

            }
        } else
        {
            System.out.println("the List of words provided is empty ");
        }
        return anagrams;
    }
}
