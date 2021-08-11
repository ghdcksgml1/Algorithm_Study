//
//  HelloApp.swift
//  Shared
//
//  Created by 홍찬희 on 8/5/21.
//

import SwiftUI

@main
struct HelloApp: App {
    var body: some Scene {
        DocumentGroup(newDocument: HelloDocument()) { file in
            ContentView(document: file.$document)
        }
    }
}
