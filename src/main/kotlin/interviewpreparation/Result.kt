package interviewpreparation

sealed class Result
data class Success(val value: Int) : Result()
data class Failure(val message: String) : Result()