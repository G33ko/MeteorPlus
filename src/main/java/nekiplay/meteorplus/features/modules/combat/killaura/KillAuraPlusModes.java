package nekiplay.meteorplus.features.modules.combat.killaura;

public enum KillAuraPlusModes {
	None,
	LiquidBounce,
	VanilaPlus;

	@Override
	public String toString() {
		return super.toString().replaceAll("Plus", "+").replaceAll("_", " ");
	}
}
