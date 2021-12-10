package OOP1.TechSupport;
//Importing all classes
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response, based on specified input.
 * Input is presented to the responder as a set of words, and based on those
 * words the responder will generate a String that represents the response.
 *
 * Internally, the reponder uses a HashMap to associate words with response
 * strings and a list of default responses. If any of the input words is found
 * in the HashMap, the corresponding response is returned. If none of the input
 * words is recognized, one of the default responses is randomly chosen.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    1.0 (2011.07.31)
 */
public class Responder
{
    // Used to map key words to responses.
    private HashMap<String, String> responseMap;
    // Default responses to use if we don't recognise a word.
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;
    //New HashMap to store Synonyms of the keys
    private HashMap<String,String> synonymMap;
    //Variable to check the previous generated number
    private int check;
    /**
     * Construct a Responder
     */
    public Responder()
    {
    	//Intializing value for variable check
    	check = 0;
        responseMap = new HashMap<String, String>();
        //Creating synonymMap for synonyms 
        synonymMap = new HashMap<String,String>();
        defaultResponses = new ArrayList<String>();
        fillResponseMap();
        fillDefaultResponses();
        fillSynonymMap();
        randomGenerator = new Random();
    }

    /**
     * Generate a response from a given set of input words.
     * 
     * @param words  A set of words entered by the user
     * @return       A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
    	//Checking for each word 
    	for(String word : words) 
    	{
    		//variable for storing response
            String response = responseMap.get(word);
             
            // it will check the synonym Map if the key is available there or not
            if(synonymMap.containsKey(word)) {
            	//Variable for storing the synonym value so that we can compare it with response map  
              String synonym = synonymMap.get(word);
              //Sorting response from responseMap 
                response = responseMap.get(synonym);
                //Returning response
            }
            //If the response is not null then the response will be returned
            if(response != null) {
                return response;
            }
    	}
        // If we get here, none of the words from the input line was recognized.
        // In this case we pick one of our default responses (what we say when
        // we cannot think of anything else to say...)
        return pickDefaultResponse();
    }

    /**
     * Enter all the known keywords and their associated responses
     * into our response map.
     */
    private void fillResponseMap()
    {
        responseMap.put("crash", 
                        "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responseMap.put("slow", 
                        "I think this has to do with your hardware. Upgrading your processor\n" +
                        "should solve all performance problems. Have you got a problem with\n" +
                        "our software?");
        responseMap.put("performance", 
                        "Performance was quite adequate in all our tests. Are you running\n" +
                        "any other processes in the background?");
        responseMap.put("bug", 
                        "Well, you know, all software has some bugs. But our software engineers\n" +
                        "are working very hard to fix them. Can you describe the problem a bit\n" +
                        "further?");
        responseMap.put("windows", 
                        "This is a known bug to do with the Windows operating system. Please\n" +
                        "report it to Microsoft. There is nothing we can do about this.");
        responseMap.put("mac", 
                        "This is a known bug to do with the Mac operating system. Please\n" +
                        "report it to Apple. There is nothing we can do about this.");
        responseMap.put("expensive", 
                        "The cost of our product is quite competitive. Have you looked around\n" +
                        "and really compared our features?");
        responseMap.put("installation", 
                        "The installation is really quite straight forward. We have tons of\n" +
                        "wizards that do all the work for you. Have you read the installation\n" +
                        "instructions?");
        responseMap.put("memory", 
                        "If you read the system requirements carefully, you will see that the\n" +
                        "specified memory requirements are 1.5 giga byte. You really should\n" +
                        "upgrade your memory. Anything else you want to know?");
        responseMap.put("linux", 
                        "We take Linux support very seriously. But there are some problems.\n" +
                        "Most have to do with incompatible glibc versions. Can you be a bit\n" +
                        "more precise?");
        responseMap.put("bluej", 
                        "Ahhh, BlueJ, yes. We tried to buy out those guys long ago, but\n" +
                        "they simply won't sell... Stubborn people they are. Nothing we can\n" +
                        "do about it, I'm afraid.");
        responseMap.put("hello","Not many people say hello to robots. I do appreciate it.");
        
        responseMap.put("morning", "Good Morning, How can we help you?");
        responseMap.put("afternoon", "Good Afternoon, This is DodgySoft Technical Suppor\n"+
        				"System!! How can we help you?");
        responseMap.put("evening", "Good Evening, How can I help you?");
    }
    /**
     * Entering the synonyms of the keys in response Map and so that we can compare
     */
    private void fillSynonymMap()
    {
    	synonymMap.put("crashes", "crash");
    	synonymMap.put("buggy", "bug");
    	synonymMap.put("bugs", "bug");
    	synonymMap.put("macos", "mac");
    	synonymMap.put("mackintosh", "mac");
    	synonymMap.put("mack", "mac");
    	synonymMap.put("memories","memory");
    	synonymMap.put("gm","goodmorning");

    }
    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillDefaultResponses()
    {
        defaultResponses.add("That sounds odd. Could you describe that problem in more detail?");
        defaultResponses.add("No other customer has ever complained about this before. \n" +
                             "What is your system configuration?");
        defaultResponses.add("That sounds interesting. Tell me more...");
        defaultResponses.add("I need a bit more information on that.");
        defaultResponses.add("Have you checked that you do not have a dll conflict?");
        defaultResponses.add("That is explained in the manual. Have you read the manual?");
        defaultResponses.add("Your description is a bit wishy-washy. Have you got an expert\n" +
                             "there with you who could describe this more precisely?");
        defaultResponses.add("That's not a bug, it's a feature!");
        defaultResponses.add("Could you elaborate on that?");
    }

    /**d
     * Randomly select and return one of the default responses.
     * @return     A random default response
     */
    private String pickDefaultResponse()
    {
    	//Variable for storing the index for default response
    	int index;
    	//Running for loop so that we can check the number generated is equal or not 
    	//If the number is equal then it will generate new number 
		for(int i=0;;i++)
		{
			//Generating new random number
			index = randomGenerator.nextInt(defaultResponses.size());
			//Checking random number is equal or not 
			if(index!=check)
			{
				//If it is not equal then storing it and then breaking the loop
				check=index;
				break;
			}
		}
        // Pick a random number for the index in the default response list.
        // The number will be between 0 (inclusive) and the size of the list (exclusive).
		return defaultResponses.get(index);
    }
}