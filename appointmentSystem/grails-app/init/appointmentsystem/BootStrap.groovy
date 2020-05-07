package com.lhamer

class BootStrap {

    def init = { servletContext ->

def surgery1=new Surgery(
name:'Woodlodge Surgery',
address:'123 Woodlodge Drive',
postcode:'S15HS',
telephone:'01148734567',
numberOfPatients:'90',
description:'Woodlodge Surgery is our brand new Surgery branch located in the heart of Woodlodge.', 
openingTime:'07:00am').save()

def surgery2=new Surgery(
name:'Birchwood Surgery',
address:'123 Birchwood Lane',
postcode:'S16HG',
telephone:'01142347851',
numberOfPatients:'87',
description:'Birchwood Surgery is our established Surgery branch located in the outskirts of Birchwood.', 
openingTime:'07:00am').save()

def doctor1=new Doctor(
fullName:'Callum Adams',
qualification:'MBChB(Oxford)',
position:'GP Surgeon',
doctorEmail:'CallumAdams@email.com',
password:'Callum123',
doctorOffice:'C-9777',
doctorPhone:'07523796459',
bio:'Bringing enthusiasm and good character to the Doctors office every single day making sure patients are happy, satisfied, and healthy again.').save()

def doctor2=new Doctor(
fullName:'Nathan Palfreyman',
qualification:'MBChB(York)',
position:'GP Surgeon',
doctorEmail:'NathanPalfreyman@email.com',
password:'Nathan123',
doctorOffice:'D-8444',
doctorPhone:'07375892376',
bio:'With years upon years of experience in the field, he will ensure your health, satisfaction, and happiness is at the upmost of importance.').save()

def appointment1=new Appointment(
appDate:new Date('02/11/2020'),
appTime:'1:00pm',
appDuration:'30',
roomNumber:'B-2222').save()

def appointment2=new Appointment(
appDate:new Date('04/11/2020'),
appTime:'2:00pm',
appDuration:'45',
roomNumber:'T-2254').save()

def patient1=new Patient(
patientName:'John Louis',
patientAddress:'8 Fortland Drive',
patientResidence:'Birchwood',
patientDob:new Date('09/07/1982'),
patientID:'4789',
dateRegistered:new Date('10/04/2019'),
patientPhone:'0726594399',
appointment:appointment1).save()

def patient2=new Patient(
patientName:'Dan Johnson',
patientAddress:'12 Pitt Road',
patientResidence:'Northwool',
patientDob:new Date('02/04/1993'),
patientID:'4477',
dateRegistered:new Date('11/06/2019'),
patientPhone:'07629987743',
appointment:appointment2).save()

def receptionsit1=new Receptionsit(
recepName:'Racheal Smith',
recepEmail:'RachealSmith@email.com',
recepUsername:'RSmith',
recepPassword:'Smith123',
recepPhone:'01143456234').save()

def receptionsit2=new Receptionsit(
recepName:'Dave Lawrence',
recepEmail:'DaveLawrence@email.com',
recepUsername:'DLawrence',
recepPassword:'Lawrence123',
recepPhone:'01143345672').save()

def nurse1=new Nurse(
nurseName:'June Dawn',
qualifications:'Registered General Nurse',
nurseEmail:'JuneDawn@email.com',
nurseOffice:'B-467',
nursePhone:'01145678109').save()

def nurse2=new Nurse(
nurseName:'Connor Palsim',
qualifications:'Registered General Nurse',
nurseEmail:'ConnorPalsim@email.com',
nurseOffice:'D-111',
nursePhone:'01143097665').save()



def prescription1=new Prescription(
pharmacyName:'City Site Pharmacy',
prescripNumber:'47899',
medicine:'Buscopan',
totalCost:'£6.00',
dateIssued:new Date('04/01/2020'),
patientPaying:'Yes').save()

def prescription2=new Prescription(
pharmacyName:'City Site Pharmacy',
prescripNumber:'22335',
medicine:'Steriod Eczema Cream',
totalCost:'£11.00',
dateIssued:new Date('11/02/2020'),
patientPaying:'No').save()

doctor1.addToPrescription(prescription1)
doctor2.addToPrescription(prescription2)
doctor1.addToPrescription(prescription2)
doctor2.addToPrescription(prescription1)

doctor1.addToSurgery(surgery1)
doctor2.addToSurgery(surgery2)
doctor1.addToSurgery(surgery2)
doctor2.addToSurgery(surgery1)

doctor1.addToAppointment(appointment1)
doctor2.addToAppointment(appointment2)
doctor1.addToAppointment(appointment2)
doctor2.addToAppointment(appointment1)

surgery1.addToReceptionsit(receptionsit1)
surgery2.addToReceptionsit(receptionsit2)
surgery1.addToReceptionsit(receptionsit2)
surgery2.addToReceptionsit(receptionsit1)

surgery1.addToNurse(nurse1)
surgery2.addToNurse(nurse2)
surgery1.addToNurse(nurse2)
surgery2.addToNurse(nurse1)

patient1.addToPrescription(prescription1)
patient2.addToPrescription(prescription2)
patient1.addToPrescription(prescription2)
patient2.addToPrescription(prescription1)

doctor1.addToNurse(nurse1)
doctor2.addToNurse(nurse2)
doctor1.addToNurse(nurse2)
doctor2.addToNurse(nurse1)

doctor1.addToPatient(patient1)
doctor2.addToPatient(patient2)
doctor1.addToPatient(patient2)
doctor2.addToPatient(patient1)

patient1.addToSurgery(surgery1)
patient2.addToSurgery(surgery2)
patient1.addToSurgery(surgery2)
patient2.addToSurgery(surgery1)






    }
    def destroy = {
    }
}
