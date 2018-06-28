package util;

public enum DocumentReadyState {
	LOADING("loading"), INTERACTIVE("interactive"), COMPLETE("complete");
	
	DocumentReadyState(String name) {
		this.stateName = name;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public static DocumentReadyState fromString(String input) {
		if (input != null) {
			input = input.trim();
			for (DocumentReadyState state : DocumentReadyState.values()) {
				if (input.equalsIgnoreCase(state.getStateName())) {
					return state;
				}
			}
		}
		
		return null;
	}
	
	private final String stateName;
}
