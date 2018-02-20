package edu.towson.cis.cosc442.project2.fibonacci;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	public static VendingMachine VM;

	@Before
	public void setUp() throws Exception {
		VM = new VendingMachine();
		VendingMachineItem vmi = new VendingMachineItem("Chips", 1);
	}

	@After
	public void tearDown() throws Exception {
		VM = null;
	}

	/*
	 * Input = new VendingMachineItem inserted at index 0/slot A
	 * Assuming empty slot = successful add item
	 */
	@Test
	public void testAddItem_slot_empty() {
		 VendingMachineItem vmi = new VendingMachineItem("Chips", 1);
		 VM.addItem(vmi, "A");
		 assertEquals(vmi, VM.getItem("A")); // VendingMachine.getItem() returns the object, not item string
	}
	
	/*
	 * 2 Inputs - Fill slot A/index 0 with item. Attempt to add another unique object to the same slot
	 * Expected result = exception 
	 */
	@Test (expected = Exception.class)
	public void testAddItem_slot_full() {
		VendingMachineItem vmi = new VendingMachineItem("Chips", 1);
		VendingMachineItem vmi2 = new VendingMachineItem("Cookies", 1);
		VM.addItem(vmi, "A");
		VM.addItem(vmi2, "A");
		assertNotEquals(vmi2, VM.getItem("A"));
	}

	
	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertMoney() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakePurchase() {
		fail("Not yet implemented");
	}

	@Test
	public void testReturnChange() {
		fail("Not yet implemented");
	}

}
