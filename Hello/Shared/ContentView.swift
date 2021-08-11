//
//  ContentView.swift
//  Shared
//
//  Created by 홍찬희 on 8/5/21.
//

import SwiftUI

struct ContentView: View {
    @Binding var document: HelloDocument

    var body: some View {
        TextEditor(text: $document.text)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(document: .constant(HelloDocument()))
    }
}
