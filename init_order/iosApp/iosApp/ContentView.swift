import SwiftUI
import shared

struct ContentView: View {

	var body: some View {
        Text(OrderBKt.orderA.dependency?.name ?? "none")
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
