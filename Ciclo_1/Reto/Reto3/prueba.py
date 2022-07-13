def tieneDuplicados(text):
    text = str(text)
    return len([text[i] for i in range(len(text)) if text[i]==text[i-1]])>0


tieneDuplicados("aaabbccca")