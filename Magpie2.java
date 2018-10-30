public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0
			    || statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Folwell") >= 0)
		{
			response = "He sounds like a good teacher.";
		}
		else if ((statement.indexOf("") >= 0) && (statement.length() == 0))
		{
			response = "Say something, please.";
		}
		else if (statement.indexOf("Brooklyn") >= 0)
		{
			response = "Brooklyn is a nice borough.";
		}
		else if (statement.indexOf("Mexico") >= 0)
		{
			response = "Mexico is a very nice country.";
		}
		else if (statement.indexOf("sushi") >= 0)
		{
			response = "Sushi is very delicious.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Yeah, I agree.";
		}
		else if (whichResponse == 5)
		{
			response = "Go on.";
		}
		return response;
	}
}
