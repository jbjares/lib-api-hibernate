package de.difuture.ekut.pht.lib.train.api.data.converter

import de.difuture.ekut.pht.lib.train.api.data.TrainTag
import javax.persistence.AttributeConverter

class TrainTagConverter : AttributeConverter<TrainTag, String> {

    override fun convertToDatabaseColumn(attribute: TrainTag) = attribute.repr
    override fun convertToEntityAttribute(dbData: String) = TrainTag.of(dbData)
}
