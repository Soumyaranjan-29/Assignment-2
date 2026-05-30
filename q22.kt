//The Exhaustive State machine
sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}
fun renderUI(state: ScreenState) {
    when (state) {
        is ScreenState.Loading ->
            println("Loading data...")
        is ScreenState.Success ->
            println("Success: ${state.data}")
        is ScreenState.Error ->
            println("Error: ${state.errorMsg}")
    }
}

fun main() {
    renderUI(ScreenState.Loading)
    renderUI(
        ScreenState.Success("Data loaded")
    )
    renderUI(
        ScreenState.Error("Failure")
    )
}
