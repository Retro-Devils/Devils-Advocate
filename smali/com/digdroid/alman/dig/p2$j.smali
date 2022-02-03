.class Lcom/digdroid/alman/dig/p2$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p2;->X1(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/p2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2$j;->b:Lcom/digdroid/alman/dig/p2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2$j;->b:Lcom/digdroid/alman/dig/p2;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/p2;->F0:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    invoke-virtual {p1}, Landroid/speech/SpeechRecognizer;->cancel()V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/p2$j;->b:Lcom/digdroid/alman/dig/p2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    return-void
.end method
