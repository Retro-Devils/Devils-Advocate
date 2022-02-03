.class Lcom/digdroid/alman/dig/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/k;->D3(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/k;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/k;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/k$a;->c:Lcom/digdroid/alman/dig/k;

    iput-object p2, p0, Lcom/digdroid/alman/dig/k$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/k$a;->c:Lcom/digdroid/alman/dig/k;

    iget-object p2, p0, Lcom/digdroid/alman/dig/k$a;->b:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/k;->K3(Ljava/lang/String;Z)V

    return-void
.end method
