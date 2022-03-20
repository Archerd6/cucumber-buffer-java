package io.cucumber.skeleton;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{
	private BufferAcotado<String> privateBuffer; // La instancia del buffer que voy a probar

	String primerElemento;                       // Variable para comprobar el primer elemento que se insertó
	private int bufferSize;                      // Variable para comprobar el tamaño que debería tener el buffer
	boolean bufferLleno;                         // Variable para comprobar si debería estar lleno el buffer
	
	@Given("I have a <string>buffer with a capacity of {int}")
	public void i_have_a_string_buffer_with_a_capacity_of(Integer int1)
	{
		privateBuffer = new BufferAcotado<String>(int1); // Tipo String <String>
	}
	@When("I add the first element {string}")
	public void i_add_the_first_element(String string)
	{
	    try
	    {
	    	privateBuffer.put(string);
		    this.bufferSize++;                           // Se debería aumentar el tamaño
	    } catch (IllegalStateException e)
	    {
	    	bufferLleno = true;
	    }
	    primerElemento = string;                         // Se guarda el primer string
	}
	@When("I add a {string}")
	public void i_add_an(String string)
	{
	    try
	    {
	    	privateBuffer.put(string);
		    bufferSize++;                                // Se debería aumentar el tamaño
	    } catch (IllegalStateException e)
	    {
	    	bufferLleno = true;
	    }
	}
	@Then("Get should be the first string")
	public void get_should_be_the_first_string()
	{
		Assertions.assertEquals(primerElemento, privateBuffer.get());
	}
	
	@Then("The buffer should be empty")
	public void the_buffer_should_be_empty()
	{
		 Assertions.assertTrue(privateBuffer.isEmpty());
	}
	
	@Then("The size should be full")
	public void the_size_should_be_full()
	{
		Assertions.assertTrue(privateBuffer.isFull());
	}
	
	@Then("It is added to the buffer")
	public void it_is_added_to_the_buffer() {
		Assertions.assertEquals(bufferSize, privateBuffer.size());
	}
	
	@Given("I have a full buffer")
	public void i_have_a_full_buffer()
	{
		privateBuffer = new BufferAcotado<String>(2);
		privateBuffer.put("first string");
		privateBuffer.put("second string");
	}
	@Then("I can't add the element")
	public void i_can_t_add_the_element()
	{
		Assertions.assertEquals(true, bufferLleno);
	}
	
}