# JStrawPoll [![Build Status](https://travis-ci.org/SSederberg/JStrawPoll.svg?branch=master)](https://travis-ci.org/SSederberg/JStrawPoll) [![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)
A Java API to be used for [StrawPoll.me](http://www.strawpoll.me/)

## Getting Started
JSP (JStrawPoll) depends on [json-simple](https://github.com/fangyidong/json-simple) to work. If you are using Maven, you can add this dependency by simply adding the following to your pom.xml
``` maven
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
```
To get JSP, simply download the latest version from the [releases](https://github.com/SSederberg/JStrawPoll/releases) tab and add the JAR as an external library.

# Limitations & Potential Issues

JSP only supports up to 30 answers per poll. This is a limitation by the developers of StrawPoll.me and not myself
## Example 

```java
import java.io.IOException;
import java.net.MalformedURLException;

import me.spencersederberg.jstrawpoll.DupCheck;
import me.spencersederberg.jstrawpoll.JStrawPoll;

public class Test {

	public static void main(String[] args) throws MalformedURLException, IOException
    {
        JStrawPoll poll = new JStrawPoll();
        
        poll
        .withCaptcha(false) // Enables/Disables StrawPoll to require a Captcha check to vote Default: FALSE
        
        .withDupcheck(DupCheck.DISABLED) // Enables/Disables an IP Check to prevent multiple entries by the same person. Default: NORMAL
        
        .withMulti(false) // Enables/Disables voters to vote on more than once choice. Default: false
        
        .withTitle("What movie should we watch?") // Sets the title of your StrawPoll (REQUIRED TO WORK)
        
        .withOptions("Star Trek", "Mad Max", "U-571") // Sets the options your voters can choose from
        // This method also supports ArrayLists for ease of input. 
        
        .buildForRawJSON(); // Makes the API call that will return the JSON created by StrawPoll
    }

    
}

```
## License 

JStrawPoll uses the MIT License, the full license can be found in the [LICENSE](https://github.com/SSederberg/JStrawPoll/blob/master/LICENSE) file
