package models

case class SessionData(
    sessionId: String,
    header: HeaderStruct,
    unit: Option[AcsUnit] = None,
    deviceId: Option[DeviceIdStruct] = None,
    events: Seq[EventStruct] = Seq.empty,
    params: Seq[ParameterValueStruct] = Seq.empty,
    requests: Seq[CwmpMethod] = Seq.empty
)
