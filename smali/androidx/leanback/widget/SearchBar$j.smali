.class Landroidx/leanback/widget/SearchBar$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/speech/RecognitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/leanback/widget/SearchBar;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/leanback/widget/SearchBar;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/SearchBar;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeginningOfSpeech()V
    .locals 0

    return-void
.end method

.method public onBufferReceived([B)V
    .locals 0

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 0

    return-void
.end method

.method public onError(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer other error"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :pswitch_0
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer insufficient permissions"

    goto :goto_0

    :pswitch_1
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer busy"

    goto :goto_0

    :pswitch_2
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer no match"

    goto :goto_0

    :pswitch_3
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer speech timeout"

    goto :goto_0

    :pswitch_4
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer client error"

    goto :goto_0

    :pswitch_5
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer server error"

    goto :goto_0

    :pswitch_6
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer audio error"

    goto :goto_0

    :pswitch_7
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer network error"

    goto :goto_0

    :pswitch_8
    sget-object p1, Landroidx/leanback/widget/SearchBar;->b:Ljava/lang/String;

    const-string v0, "recognizer network timeout"

    :goto_0
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->j()V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->e()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onEvent(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onPartialResults(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "results_recognition"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v1, v1, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v1, v0, p1}, Landroidx/leanback/widget/SearchEditText;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    iget-object p1, p1, Landroidx/leanback/widget/SearchBar;->e:Landroidx/leanback/widget/SpeechOrbView;

    invoke-virtual {p1}, Landroidx/leanback/widget/SpeechOrbView;->f()V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->f()V

    return-void
.end method

.method public onResults(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "results_recognition"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Landroidx/leanback/widget/SearchBar;->g:Ljava/lang/String;

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v0, p1, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    iget-object p1, p1, Landroidx/leanback/widget/SearchBar;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->k()V

    :cond_0
    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->j()V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->g()V

    return-void
.end method

.method public onRmsChanged(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    :goto_0
    iget-object v0, p0, Landroidx/leanback/widget/SearchBar$j;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v0, v0, Landroidx/leanback/widget/SearchBar;->e:Landroidx/leanback/widget/SpeechOrbView;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/SpeechOrbView;->setSoundLevel(I)V

    return-void
.end method
