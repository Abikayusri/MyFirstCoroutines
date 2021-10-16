package abika.sinau.myfirstcoroutine.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscriber_data_table")
data class Subscriber(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "subscriber_id")
    val id: Int? = null,

    @ColumnInfo(name = "subscriber_name")
    val name: String? = null,

    @ColumnInfo(name = "subscriber_email")
    val email: String? = null
)