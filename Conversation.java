import java.util.Scanner;
import java.util.Arrays;


/** A class that contains a method that creates a chat bot that interacts with a user for a specific amount of conversation rounds
 * @author Tajhini Brown
 */
class Conversation {
 /**
 * Creates a chat bot that interacts with a user for a specific amount of conversation rounds
 * @param String[] arguments, list
 * @return returns nothing
 */
  public static void main(String[] arguments) {
    // You will start the conversation here.
      
      String[] canned_words = {"Mmm-hm.", "Oh Okay", "Interesting", "That's cool"};
      String[] pronoun_words = {"I", "me", "am", "you", "my", "your", "I'm"};
      String[] mirror_words = {"You", "you", "are", "I", "your", "my", "You're"};
      String[] transcript = {};
      int min = 0;
      int max = (canned_words.length -1);
      
      Scanner Input = new Scanner(System.in);
      System.out.println("Insert the number of rounds of conversations.");
      int convoNumber = Input.nextInt();

      Scanner Input_1 = new Scanner(System.in);
      System.out.println("Hello, what are you thinking about?");
      String userInput = Input_1.nextLine();
    
      transcript = Arrays.copyOf(transcript, transcript.length + 1);
      transcript[transcript.length - 1] = "Hello, what are you thinking about?";
      transcript = Arrays.copyOf(transcript, transcript.length + 1);
      transcript[transcript.length - 1] = userInput;

      for ( int x = 0; x < (convoNumber-1); x++){

                if (userInput.contains("I ") || userInput.contains("me") || userInput.contains("am") || userInput.contains("you") || userInput.contains("my") || userInput.contains("your") ||  userInput.contains("I'm")){
                  
                  String[] inputsplit = userInput.split(" ", 0);

                  for (int i = 0; i < inputsplit.length; i++) {
                    
                        if (inputsplit[i].equals("I") ) {
                          int word_placement = Arrays.asList(pronoun_words).indexOf("I");
                          int placement_phrase = Arrays.asList(inputsplit).indexOf("I");
                          String wrd_in_ref_phrase = mirror_words[word_placement];
                          inputsplit[placement_phrase] = wrd_in_ref_phrase;

                          if (inputsplit[i+1].equals("am") ) {
                            int word_placement_1 = Arrays.asList(pronoun_words).indexOf("am");
                            int placement_phrase_1 = Arrays.asList(inputsplit).indexOf("am");
                            String wrd_in_ref_phrase_1 = mirror_words[word_placement_1];
                            inputsplit[placement_phrase_1] = wrd_in_ref_phrase_1;
                          }
                        }
                  
                        if (inputsplit[i].equals("you") ) {
                          int word_placement = Arrays.asList(pronoun_words).indexOf("you");
                          int placement_phrase = Arrays.asList(inputsplit).indexOf("you");
                          String wrd_in_ref_phrase = mirror_words[word_placement];
                          inputsplit[placement_phrase] = wrd_in_ref_phrase;
                        }
                        if (inputsplit[i].equals("my") ) {
                          int word_placement = Arrays.asList(pronoun_words).indexOf("my");
                          int placement_phrase = Arrays.asList(inputsplit).indexOf("my");
                          String wrd_in_ref_phrase = mirror_words[word_placement];
                          inputsplit[placement_phrase] = wrd_in_ref_phrase;
                        }
                        if (inputsplit[i].equals("your") ) {
                          int word_placement = Arrays.asList(pronoun_words).indexOf("your");
                          int placement_phrase = Arrays.asList(inputsplit).indexOf("your");
                          String wrd_in_ref_phrase = mirror_words[word_placement];
                          inputsplit[placement_phrase] = wrd_in_ref_phrase;
                        }
                        if (inputsplit[i].equals("I'm") ) {
                          int word_placement = Arrays.asList(pronoun_words).indexOf("I'm");
                          int placement_phrase = Arrays.asList(inputsplit).indexOf("I'm");
                          String wrd_in_ref_phrase = mirror_words[word_placement];
                          inputsplit[placement_phrase] = wrd_in_ref_phrase;
                        }
                
                  }
                  String new_phrase = String.join(" ", inputsplit);
                  String return_message = new_phrase + "?";
                  transcript = Arrays.copyOf(transcript, transcript.length + 1);
                  transcript[transcript.length - 1] = return_message;

                  System.out.println(return_message);
                  Scanner Input_2 = new Scanner(System.in);
                  userInput = Input_2.nextLine();
                  transcript = Arrays.copyOf(transcript, transcript.length + 1);
                  transcript[transcript.length - 1] = userInput;
                  
                } else {
                  int canned_index = (int)(Math.random()*(max-min+1)+min);
                  String canned = canned_words[canned_index];
                  System.out.println(canned);
                  transcript = Arrays.copyOf(transcript, transcript.length + 1);
                  transcript[transcript.length - 1] = canned;

                  Scanner Input_3 = new Scanner(System.in);
                  userInput = Input_3.nextLine();
                  transcript = Arrays.copyOf(transcript, transcript.length + 1);
                  transcript[transcript.length - 1] = userInput;
                  
                } 
      }
      int canned_index_1= (int)(Math.random()*(max-min+1)+min);
      String final_statement = canned_words[canned_index_1];
      System.out.println(final_statement);
      transcript = Arrays.copyOf(transcript, transcript.length + 1);
      transcript[transcript.length - 1] = final_statement;
      System.out.println("Well...goodbye.");
      transcript = Arrays.copyOf(transcript, transcript.length + 1);
      transcript[transcript.length - 1] = "Well...goodbye.";

      System.out.println("***TRANSCRIPT***");
      int transcript_range = transcript.length;
      for (int z = 0; z < transcript_range; ++z){
        System.out.println(transcript[z]);
        
      }
      
    Input.close();
    Input_1.close();
    





      





  }
}