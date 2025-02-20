package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Interactions {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Interactions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	 public void click(By element) {
	        
	        for (int attempts = 0; attempts < 3; attempts++) {
        	    try {
        	    	
        	        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        	        clickableElement.click();

        	        // Break the loop if no exception is thrown
        	        break;
        	    } catch (StaleElementReferenceException e) {
        	        // Retry locating and interacting with the element
        	        System.out.println("StaleElementReferenceException on Click encountered. Retrying...");
        	    }
        	}
	    }

	    public void enterText(By element, String text) throws InterruptedException {
	       
	        
	        for (int attempts = 0; attempts < 3; attempts++) {
        	    try {
        			Thread.sleep(2000);
        	    	 WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        		        inputField.sendKeys(text);

        	        // Break the loop if no exception is thrown
        	        break;
        	    } catch (StaleElementReferenceException e) {
        	        // Retry locating and interacting with the element
        	        System.out.println("StaleElementReferenceException on Enter Text encountered. Retrying...");
        	    }
        	}
	    }
	    
	    public void clearText(By element) {
	    	 
	         
	         for (int attempts = 0; attempts < 3; attempts++) {
	        	    try {
	        	    	
	        	    	WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	       	         	inputField.clear();

	        	        // Break the loop if no exception is thrown
	        	        break;
	        	    } catch (StaleElementReferenceException e) {
	        	        // Retry locating and interacting with the element
	        	        System.out.println("StaleElementReferenceException on Clear Text encountered. Retrying...");
	        	    }
	        	}
	    }
	    
	    public void verifyText(By element, String expectedText) {
	    	 
	         
	         for (int attempts = 0; attempts < 3; attempts++) {
	        	    try {
	        	    	
	        	    	WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	       	         	String acutalText = inputField.getText();
	       	         	System.out.println("Actual Text: " + acutalText);
	       	         	Assert.assertEquals(acutalText, expectedText, "Text in did not match expected value.");

	        	        // Break the loop if no exception is thrown
	        	        break;
	        	    } catch (StaleElementReferenceException e) {
	        	        // Retry locating and interacting with the element
	        	        System.out.println("StaleElementReferenceException on Verify Text encountered. Retrying...");
	        	    }
	        	}
	    }
	    
	    
	    
	    
	    
		public void clickElement(Object target) {
			WebElement element;
			if (target instanceof By) {
				element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
			} else if (target instanceof WebElement) {
				element = (WebElement) target;
			} else {
				throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
			}
			clickElementJS(element);
		}

		public void switchToIframe(By locator) {
			WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.switchTo().frame(iframe);
		}

		private void clickElementJS(WebElement element) {
			try {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
			} catch (ElementClickInterceptedException e) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} catch (Exception e) {
				System.out.println("Failed to click the element. Error: " + e.getMessage());
			}
		}

		public WebElement visibilityEle(By locator) {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

		public void sendingKeys(By locator, String keyValue) {
			WebElement element = visibilityEle(locator);
			element.clear();
			element.sendKeys(keyValue);
		}

		public void executeWithDelay(Runnable action) {
			try {
				Thread.sleep(2000);
				action.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public String getTabTitle(By locator) {
			String tabTitle = driver.findElement(locator).getText();
			return tabTitle;
		}

		public String getInnerText(By locator) {
			String tabTitle = driver.findElement(locator).getText();
			return tabTitle;
		}

		public void hoverOverElement(By element) {
			try {
				WebElement hoverElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
				Actions actions = new Actions(driver);
				actions.moveToElement(hoverElement).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


		public String getText(By element) {
			try {
				WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
				return textElement.getText();
			} catch (Exception e) {
				e.printStackTrace();
				return null; // Return null in case of any exception
			}
		}
	
}
