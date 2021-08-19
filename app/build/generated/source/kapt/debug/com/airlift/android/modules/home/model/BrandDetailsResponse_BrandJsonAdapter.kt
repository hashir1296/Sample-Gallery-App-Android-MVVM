// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.airlift.android.modules.home.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class BrandDetailsResponse_BrandJsonAdapter(
  moshi: Moshi
) : JsonAdapter<BrandDetailsResponse.Brand>() {
  private val options: JsonReader.Options = JsonReader.Options.of("image", "name", "url")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "image")

  public override fun toString(): String = buildString(48) {
      append("GeneratedJsonAdapter(").append("BrandDetailsResponse.Brand").append(')') }

  public override fun fromJson(reader: JsonReader): BrandDetailsResponse.Brand {
    var image: String? = null
    var name: String? = null
    var url: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> image = nullableStringAdapter.fromJson(reader)
        1 -> name = nullableStringAdapter.fromJson(reader)
        2 -> url = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return BrandDetailsResponse.Brand(
        image = image,
        name = name,
        url = url
    )
  }

  public override fun toJson(writer: JsonWriter, value_: BrandDetailsResponse.Brand?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("image")
    nullableStringAdapter.toJson(writer, value_.image)
    writer.name("name")
    nullableStringAdapter.toJson(writer, value_.name)
    writer.name("url")
    nullableStringAdapter.toJson(writer, value_.url)
    writer.endObject()
  }
}
