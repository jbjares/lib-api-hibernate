package de.difuture.ekut.pht.lib.train.api.data.converter

import de.difuture.ekut.pht.lib.train.api.data.TrainId
import javax.persistence.AttributeConverter

class TrainIdConverter : AttributeConverter<TrainId, String> {

    override fun convertToDatabaseColumn(attribute: TrainId) = attribute.repr
    override fun convertToEntityAttribute(dbData: String) = TrainId.of(dbData)
}
