# 30. Discuss the Working of Self-Replicating Malicious Code with Examples

## 1. Introduction

**Self-replicating malicious code** refers to software programs that automatically copy themselves and spread across systems without the user's consent. The most common forms are **viruses and worms**. They can cause system disruption, data theft, or create backdoors for attackers. 

## 2. Basic Working

The working of self-replicating malicious code can be understood as:

**Infection → Replication → Propagation → Trigger → Payload Execution → Persistence**

Once the malicious code enters a system, it creates copies of itself and spreads to other files, systems, or networks. 

## 3. Insertion or Creation

First, the malicious code is **introduced into a computer system**. This may happen through infected files, email attachments, malicious links, removable media, or vulnerable software.

## 4. Replication

After entering the system, the malware **creates copies of itself**. A virus may attach itself to other files or programs, while a worm can independently create and distribute copies across a network. 

## 5. Propagation

The replicated code spreads to other systems through different methods such as **email attachments, malicious links, USB drives, infected software, and vulnerable network services**. 

## 6. Trigger

The malicious code may remain inactive until a specific **user action, time, or system event** occurs. After the trigger condition is satisfied, the malware activates its malicious functionality. 

## 7. Payload Execution

After activation, the malware performs its intended malicious activity, called the **payload**. This may include **data theft, file corruption, system disruption, or creation of backdoors**. 

## 8. Persistence

Some self-replicating malware attempts to **remain active after system reboots**. It may hide itself or reinstall its components so that it continues operating on the infected system. 

## 9. Types with Examples

### Virus

A **virus attaches itself to a host program or file** and generally requires user action, such as opening or running an infected file, to spread. Examples from the study material include **Jerusalem, Melissa, and Happy99**. 

### Worm

A **worm is a standalone malicious program** that can spread automatically through networks by exploiting vulnerabilities. It can consume system or network resources and slow down or stop system operations.  

### Macro Virus

A macro virus is written using **macro languages** and commonly spreads through infected documents, such as MS Office documents. Examples include **Melissa and Word Concept**.

### Multipartite Malware

Multipartite malware infects **multiple parts of a system**, such as files and boot sectors, making it difficult to remove completely. 

## 10. Characteristics

The important characteristics of self-replicating malicious code are **replication, propagation, payload, stealth, and persistence**. Stealth techniques such as obfuscation and polymorphism may be used to evade detection. 

## 11. Impacts

Self-replicating malicious code can cause **data loss or corruption, identity theft, privacy breaches, system slowdown or crashes, botnet creation, and financial or reputational damage**. 

## Conclusion

Self-replicating malicious code works by **entering a system, creating copies, spreading to other systems, activating its payload, and maintaining its presence**. Viruses, worms, macro viruses, and multipartite malware are common forms that can seriously affect computer systems and networks. 
