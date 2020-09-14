package ke.co.postapp.repository

import com.example.postapp.api.apiClient
import com.example.postapp.api.apiInterface
import com.example.postapp.models.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext
import retrofit2.Response


class PostsRepository() {
    suspend fun getPosts(): Response<List<Post>> = withContext(Dispatchers.IO + NonCancellable) {
        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val response = apiClient.getPosts()
        return@withContext response
    }
}