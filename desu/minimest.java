    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class SeleniumExample {
        public static void main(String[] args) {
            // Set up the WebDriver (assumes you have the chromedriver executable in your PATH)
            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            try {
                // Navigate to the webpage
                driver.get("http://example.com");

                // Locate the button using XPath and click it
                WebElement button = driver.findElement(By.xpath("//header/button[1]"));
                button.click();

                // Additional test steps...
            } finally {
                // Clean up and close the browser
                driver.quit();
            }
        }
    }
    