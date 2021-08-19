// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.airlift.android.modules.detail.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class PhotoDetailNetworkResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<PhotoDetailNetworkResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("avg_color", "height", "id",
      "liked", "photographer", "photographer_id", "photographer_url", "src", "url", "width")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "avgColor")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "height")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "liked")

  private val nullableSrcAdapter: JsonAdapter<PhotoDetailNetworkResponse.Src?> =
      moshi.adapter(PhotoDetailNetworkResponse.Src::class.java, emptySet(), "src")

  public override fun toString(): String = buildString(48) {
      append("GeneratedJsonAdapter(").append("PhotoDetailNetworkResponse").append(')') }

  public override fun fromJson(reader: JsonReader): PhotoDetailNetworkResponse {
    var avgColor: String? = null
    var height: Int? = null
    var id: Int? = null
    var liked: Boolean? = null
    var photographer: String? = null
    var photographerId: Int? = null
    var photographerUrl: String? = null
    var src: PhotoDetailNetworkResponse.Src? = null
    var url: String? = null
    var width: Int? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> avgColor = nullableStringAdapter.fromJson(reader)
        1 -> height = nullableIntAdapter.fromJson(reader)
        2 -> id = nullableIntAdapter.fromJson(reader)
        3 -> liked = nullableBooleanAdapter.fromJson(reader)
        4 -> photographer = nullableStringAdapter.fromJson(reader)
        5 -> photographerId = nullableIntAdapter.fromJson(reader)
        6 -> photographerUrl = nullableStringAdapter.fromJson(reader)
        7 -> src = nullableSrcAdapter.fromJson(reader)
        8 -> url = nullableStringAdapter.fromJson(reader)
        9 -> width = nullableIntAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return PhotoDetailNetworkResponse(
        avgColor = avgColor,
        height = height,
        id = id,
        liked = liked,
        photographer = photographer,
        photographerId = photographerId,
        photographerUrl = photographerUrl,
        src = src,
        url = url,
        width = width
    )
  }

  public override fun toJson(writer: JsonWriter, value_: PhotoDetailNetworkResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("avg_color")
    nullableStringAdapter.toJson(writer, value_.avgColor)
    writer.name("height")
    nullableIntAdapter.toJson(writer, value_.height)
    writer.name("id")
    nullableIntAdapter.toJson(writer, value_.id)
    writer.name("liked")
    nullableBooleanAdapter.toJson(writer, value_.liked)
    writer.name("photographer")
    nullableStringAdapter.toJson(writer, value_.photographer)
    writer.name("photographer_id")
    nullableIntAdapter.toJson(writer, value_.photographerId)
    writer.name("photographer_url")
    nullableStringAdapter.toJson(writer, value_.photographerUrl)
    writer.name("src")
    nullableSrcAdapter.toJson(writer, value_.src)
    writer.name("url")
    nullableStringAdapter.toJson(writer, value_.url)
    writer.name("width")
    nullableIntAdapter.toJson(writer, value_.width)
    writer.endObject()
  }
}
