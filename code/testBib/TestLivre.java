/**
 * 
 */
package testBib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Amina
 *
 */
class TestLivre {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link livre#getEtat()}.
	 */
	@Test
	void testGetEtat() {
		System.out.print("test passe getEtat");
	}

	/**
	 * Test method for {@link livre#setEtat(java.lang.String)}.
	 */
	@Test
	void testSetEtat() {
		System.out.print("test passe setEtat");
	}

	/**
	 * Test method for {@link livre#getTitre()}.
	 */
	@Test
	void testGetTitre() {
		System.out.print("test passe getTitre");
	}

}
