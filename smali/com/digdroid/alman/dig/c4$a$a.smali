.class Lcom/digdroid/alman/dig/c4$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/c4$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/c4$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/c4$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/c4$a$a;->b:Lcom/digdroid/alman/dig/c4$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c4$a$a;->b:Lcom/digdroid/alman/dig/c4$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/c4$a;->b:Lcom/digdroid/alman/dig/c4;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->u0()V

    return-void
.end method
