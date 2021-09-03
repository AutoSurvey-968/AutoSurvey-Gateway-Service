package com.revature.autosurvey.gateway.karate;

import com.intuit.karate.junit5.Karate;

public class KarateTest {
	@Karate.Test
	Karate runAll() {
		return Karate.run("fallback").relativeTo(getClass());
	}
}
