# 29. Compare and Contrast the CIA Triad, Star Model, and Parkerian Hexad

## 1. Introduction

Security models provide a structured way to understand and protect information and systems. The **CIA Triad, Star Model, and Parkerian Hexad** describe important security requirements, with each model adding more security aspects to address modern security needs. 

## 2. CIA Triad

The **CIA Triad** is a basic and widely used security model consisting of **Confidentiality, Integrity, and Availability**.

**Confidentiality** ensures that information is accessible only to authorized users.

**Integrity** ensures that data remains accurate and is not modified without authorization.

**Availability** ensures that systems, data, and resources are accessible to authorized users whenever required. 

## 3. Limitations of CIA Triad

The CIA Triad provides the basic foundation for information security, but it does not cover every modern security requirement. For example, it does not specifically address **accountability, auditability, authenticity, possession, or utility**. Therefore, extended security models are used. 

## 4. Star Model

The **Star Model** extends the CIA Triad by adding **Accountability and Auditability**. It is particularly useful in environments such as **healthcare, banking, and government services**, where tracking and reviewing user activities are important. 

The five aspects considered are:

**Confidentiality:** Protects information from unauthorized access.

**Integrity:** Maintains the correctness of information.

**Availability:** Ensures resources are accessible when required.

**Accountability:** Ensures users are responsible for their actions and helps prevent denial of actions.

**Auditability:** Allows activities and transactions to be reviewed and verified using logs and audit trails. 

## 5. Parkerian Hexad

The **Parkerian Hexad**, proposed by **Donn B. Parker**, expands security into six elements. It includes **Confidentiality, Integrity, Availability, Possession/Control, Authenticity, and Utility**. 

### a) Possession or Control

It refers to the **physical control or ownership of information**. For example, if an encrypted hard drive is stolen, confidentiality may remain protected, but possession of the information is lost. 

### b) Authenticity

Authenticity ensures that **data, messages, and identities are genuine** and originate from a trusted source. Digital signatures, certificates, and multi-factor authentication can support authenticity. 

### c) Utility

Utility means that information is in a **usable, functional, and meaningful form** for its intended purpose. Data may be available but still have no utility if it is stored in an unreadable or incompatible format. 

## 6. Comparison of the Three Models

| Security Model      | Main Elements                                     | Main Focus                           |
| ------------------- | ------------------------------------------------- | ------------------------------------ |
| **CIA Triad**       | Confidentiality, Integrity, Availability          | Basic information security           |
| **Star Model**      | CIA + Accountability + Auditability               | Responsibility and activity tracking |
| **Parkerian Hexad** | CIA + Possession/Control + Authenticity + Utility | Broader protection of information    |

## 7. Key Differences

The **CIA Triad** focuses on the three fundamental requirements of protecting information. The **Star Model** extends these requirements by adding accountability and auditability, making it useful where user actions must be tracked and reviewed. The **Parkerian Hexad** provides a broader view by considering possession, authenticity, and utility in addition to the CIA principles. 

## 8. Relationship Between the Models

The three models can be understood as progressively covering more security requirements:

**CIA Triad → Star Model → Parkerian Hexad**

The CIA Triad provides the foundation, the Star Model adds **accountability and auditability**, while the Parkerian Hexad adds **possession/control, authenticity, and utility**. 

## 9. Applications

The CIA Triad can be applied as a basic security framework for systems and networks. The Star Model is particularly relevant to systems requiring **user accountability and auditing**, such as banking and healthcare. The Parkerian Hexad is useful when security must also consider **ownership, authenticity, and usefulness of information**.

## 10. Conclusion

The **CIA Triad, Star Model, and Parkerian Hexad** provide different levels of security perspective. The CIA Triad focuses on **Confidentiality, Integrity, and Availability**, the Star Model adds **Accountability and Auditability**, and the Parkerian Hexad further considers **Possession/Control, Authenticity, and Utility**. Together, these models provide a broader understanding of information security requirements.

Available next action: Create a downloadable PDF file here in this chat containing the findings and recommendations above
