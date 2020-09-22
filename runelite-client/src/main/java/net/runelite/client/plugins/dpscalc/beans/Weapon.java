package net.runelite.client.plugins.dpscalc.beans;

import lombok.Getter;
import net.runelite.client.plugins.dpscalc.beans.Stances;

import java.io.Serializable;

@Getter
public class Weapon implements Serializable {
	private int attack_speed;
	private String weapon_type;
	private Stances[] stances;
}
