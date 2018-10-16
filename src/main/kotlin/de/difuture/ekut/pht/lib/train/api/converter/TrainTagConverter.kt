package de.difuture.ekut.pht.lib.train.api.converter

import de.difuture.ekut.pht.lib.train.TrainTag
import javax.persistence.AttributeConverter

class TrainTagConverter : AttributeConverter<TrainTag, String> {

    override fun convertToDatabaseColumn(attribute: TrainTag) = attribute.repr
    override fun convertToEntityAttribute(dbData: String) = TrainTag.of(dbData)
}
