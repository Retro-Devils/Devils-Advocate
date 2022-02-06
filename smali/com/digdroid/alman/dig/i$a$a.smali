.class Lcom/digdroid/alman/dig/i$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/i$a;->a([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/i$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/i$a;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i$a$a;->c:Lcom/digdroid/alman/dig/i$a;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i$a$a;->b:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/i$a$a;->c:Lcom/digdroid/alman/dig/i$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/i$a;->a:Lcom/digdroid/alman/dig/i;

    iget-object v0, p0, Lcom/digdroid/alman/dig/i$a$a;->b:[Ljava/lang/String;

    aget-object p2, v0, p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->e(Ljava/lang/String;)V

    return-void
.end method
