db.operational_flights.insertMany([
    {
        scheduledFlightNumber: "AZ123",
        date: ISODate("2025-12-02T10:00:00Z"),
        status: "scheduled", // schedulato, boarding, partito, in volo, atterrato, cancellato
        gateNumber: "A1",
        aircraftRegistration: "I-DALZ",
        crew: [
            { employeeId: 101, role: "Pilot" },
            { employeeId: 102, role: "Co-pilot" },
            { employeeId: 103, role: "Flight Attendant" }
        ]
    },
    {
        scheduledFlightNumber: "AZ123",
        date: ISODate("2025-12-03T10:00:00Z"),
        status: "boarding",
        gateNumber: "A2",
        aircraftRegistration: "I-DALZ",
        crew: [
            { employeeId: 101, role: "Pilot" },
            { employeeId: 102, role: "Co-pilot" },
            { employeeId: 104, role: "Flight Attendant" }
        ]
    },
    {
        scheduledFlightNumber: "BA456",
        date: ISODate("2025-12-02T16:00:00Z"),
        status: "in flight",
        gateNumber: "B1",
        aircraftRegistration: "G-BAAB",
        crew: [
            { employeeId: 201, role: "Pilot" },
            { employeeId: 202, role: "Co-pilot" },
            { employeeId: 203, role: "Flight Attendant" },
            { employeeId: 204, role: "Flight Attendant" }
        ]
    },
    {
        scheduledFlightNumber: "LH789",
        date: ISODate("2025-12-02T08:00:00Z"),
        status: "landed",
        gateNumber: "C3",
        aircraftRegistration: "D-AILH",
        crew: [
            { employeeId: 301, role: "Pilot" },
            { employeeId: 302, role: "Co-pilot" },
            { employeeId: 303, role: "Flight Attendant" },
            { employeeId: 304, role: "Flight Attendant" }
        ]
    }
]);
