.class Lcom/digdroid/alman/dig/r1$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r1;->s3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1$h;->b:Lcom/digdroid/alman/dig/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1$h;->b:Lcom/digdroid/alman/dig/r1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/p1$a;->H(Z)V

    return-void
.end method
