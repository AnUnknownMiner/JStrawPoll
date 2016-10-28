# JStrawPoll
A Java API to be used for StrawPoll.me

## Example 

```java
import java.io.IOException;
import java.net.MalformedURLException;

import me.spencersederberg.jstrawpoll.DupCheck;
import me.spencersederberg.jstrawpoll.JStrawPoll;

public class Test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		JStrawPoll poll = new JStrawPoll();
		
		String jsonPoll = poll.withOptions("What?", "Lol", "Metal For Life!").withTitle("What is life?")
		.withMulti(true).withDupcheck(DupCheck.NORMAL).withCaptcha(false).buildForRawJSON();
		
		System.out.println(jsonPoll);
		
		// Extract JSON as needed.
		//more...
	}
}

```

