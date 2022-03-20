package io.cucumber.skeleton;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{
	private BufferAcotado<String> buffer;
	private int numeroElementosContenidos = 0;
	boolean bufferLleno = false;
	String primerElemento;
	@Given("I have a buffer with a capacity of {int}")
	public void i_have_a_buffer_with_a_capacity_of(Integer int1)
	{
	    // Write code here that turns the phrase above into concrete actions
		buffer = new BufferAcotado<String>(int1);
	}
	@When("I add the first element {string}")
	public void i_add_the_first_element(String string)
	{
	    try
	    {
	    	buffer.put(string);
		    numeroElementosContenidos++;
	    } catch (IllegalStateException e)
	    {
	    	bufferLleno = true;
	    }
	    primerElemento = string;
	}
	@When("I add an {string}")
	public void i_add_an(String string)
	{
	    try
	    {
	    	buffer.put(string);
		    numeroElementosContenidos++;
	    } catch (IllegalStateException e)
	    {
	    	bufferLleno = true;
	    }
	}
	@Then("The first element to get should be the first I have put in the buffer")
	public void the_first_element_to_get_should_be_the_first_i_have_put_in_the_buffer()
	{
		Assertions.assertEquals(primerElemento, buffer.get());
	}
	
}